<?php
	$url = 'http://127.0.0.1/api/seances';
	$data = array('id conference' => '22I03', 'debut' => 'alisonko@esp.sn', 'fin' => 'alisonko@esp.sn', 'Partage ecran' => 'Oui');

	// use key 'http' even if you send the request to https://...
	$options = array(
		'http' => array(
			'header'  => "Content-type: application/x-www-form-urlencoded\r\n",
			'method'  => 'POST',
			'content' => http_build_query($data)
		)
	);
	$context  = stream_context_create($options);
	$result = file_get_contents($url, false, $context);
	if ($result === FALSE) { /* Handle error */ }

	var_dump($result);
?>