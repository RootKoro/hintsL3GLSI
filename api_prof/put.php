<?php
$url = "http://127.0.0.1/api/seances/1"; // modifier le produit 1
$data = array('id conference' => '22I03', 'debut' => 'alisonko@esp.sn', 'fin' => 'alisonko@esp.sn', 'Partage ecran' => 'Oui');

$ch = curl_init($url);
curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
curl_setopt($ch, CURLOPT_CUSTOMREQUEST, "PUT");
curl_setopt($ch, CURLOPT_POSTFIELDS,http_build_query($data));

$response = curl_exec($ch);

var_dump($response);

if (!$response) 
{
    return false;
}
?>