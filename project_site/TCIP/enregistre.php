<?php
 /*****************************
 * ATTENTION PAS DE SECURITE *
 *****************************/

 $params = file_get_contents("php://input");
 $json=json_decode($params, true);
 $file = 'resultats.json';
 file_put_contents($file, $params);
?>