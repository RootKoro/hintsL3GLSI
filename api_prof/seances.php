<?php
	// Connect to database
	include("db_connect.php");
	$request_method = $_SERVER["REQUEST_METHOD"];

	function getSeances()
	{
		global $conn;
		$query = "SELECT * FROM seance";
		$response = array();
		$result = mysqli_query($conn, $query);
		while($row = mysqli_fetch_array($result))
		{
			$response[] = $row;
		}
		header('Content-Type: application/json');
		echo json_encode($response, JSON_PRETTY_PRINT);
	}
	
	function getseance($id=0)
	{
		global $conn;
		$query = "SELECT * FROM seance";
		if($id != 0)
		{
			$query .= " WHERE id=".$id." LIMIT 1";
		}
		$response = array();
		$result = mysqli_query($conn, $query);
		while($row = mysqli_fetch_array($result))
		{
			$response[] = $row;
		}
		header('Content-Type: application/json');
		echo json_encode($response, JSON_PRETTY_PRINT);
	}
	
	function Addseance()
	{
		global $conn;
		$id_conference = $_POST["id_conference"];
		$partage_ecran = $_POST["partage_ecran"];
		$debut = date('Y-m-d H:i:s');
		$fin = date('Y-m-d H:i:s');
		echo $query="INSERT INTO seance(id_conference, partage_ecran_id, debut, fin) VALUES('".$id_conference."', '".$partage_ecran."', '".$debut."', '".$fin."')";
		if(mysqli_query($conn, $query))
		{
			$response=array(
				'status' => 1,
				'status_message' =>'seance ajout� avec succ�s.'
			);
		}
		else
		{
			$response=array(
				'status' => 0,
				'status_message' =>'ERREUR!.'. mysqli_error($conn)
			);
		}
		header('Content-Type: application/json');
		echo json_encode($response);
	}
	
	function updateseance($id)
	{
		global $conn;
		$_PUT = array();
		parse_str(file_get_contents('php://input'), $_PUT);
		$id_conference = $_PUT["id_conference"];
		$partage_ecran = $_PUT["partage_ecran"];
		$query="UPDATE seance SET id_conference='".$id_conference."', debut='".$debut."', partage_ecran_id='".$partage_ecran."', fin='".$fin."' WHERE id=".$id;
		
		if(mysqli_query($conn, $query))
		{
			$response=array(
				'status' => 1,
				'status_message' =>'seance mis a jour avec succes.'
			);
		}
		else
		{
			$response=array(
				'status' => 0,
				'status_message' =>'Echec de la mise a jour de seance. '. mysqli_error($conn)
			);
			
		}
		
		header('Content-Type: application/json');
		echo json_encode($response);
	}
	
	function deleteseance($id)
	{
		global $conn;
		$query = "DELETE FROM seance WHERE id=".$id;
		if(mysqli_query($conn, $query))
		{
			$response=array(
				'status' => 1,
				'status_message' =>'seance supprime avec succes.'
			);
		}
		else
		{
			$response=array(
				'status' => 0,
				'status_message' =>'La suppression du seance a echoue. '. mysqli_error($conn)
			);
		}
		header('Content-Type: application/json');
		echo json_encode($response);
	}
	
	switch($request_method)
	{
		
		case 'GET':
			// Retrive seances
			if(!empty($_GET["id"]))
			{
				$id=intval($_GET["id"]);
				getseance($id);
			}
			else
			{
				getseances();
			}
			break;
		default:
			// Invalid Request Method
			header("HTTP/1.0 405 Method Not Allowed");
			break;
			
		case 'POST':
			// Ajouter un seance
			Addseance();
			break;
			
		case 'PUT':
			// Modifier un seance
			$id = intval($_GET["id"]);
			updateseance($id);
			break;
			
		case 'DELETE':
			// Supprimer un seance
			$id = intval($_GET["id"]);
			deleteseance($id);
			break;

	}
?>