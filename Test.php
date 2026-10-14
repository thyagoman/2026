<?php



if (is_int(.90)){
    echo"vida loka <br>";
}else {
    echo"caralho<br>";
}

$numeroFloat = 33.44;
if(is_float($numeroFloat)){
    echo"o nomero é float<br>";
    echo"o nomero é float<br>";
}

$numeroDouble =88.55;
if(is_double($numeroDouble)){
    echo"nossa é double <br>";
}else {
    echo" Não é double";
}


var_dump($numeroFloat);
echo"<br>";
var_dump($numeroDouble);
echo"<br>";


$nome = " tiago aparecido pereira ";
echo $nome;
echo"<br>";

$idade = 10;
$valor = 10.1;
$booleana = true;
$numeroGrande = 10.888888444444444444444444444444444444488888888;

echo"===========================Utilização de VAR_DUMP================================";
echo"<br>";
echo"<br>";
var_dump($nome);
echo"<br>";
var_dump($booleana);
echo"<br>";
var_dump($idade);
echo"<br>";
var_dump($numeroGrande);
echo"<br>";

echo $idade. " é idade nome dele é  ".$nome. " o numero de telefone é ".$numeroGrande;
echo"<br>";
echo"<br>";
$numero1 = 50;
$numero2 = 50.0;
echo " ==OPERAÇÕES ARITMETICAS ==============================================";
echo"<br>";
echo"<br>";
echo "A soma é ".$numero1 + $numero2;
echo"<br>";
echo"<br>";
echo "A multiplicação é ".$numero1 * $numero2;
echo"<br>";
echo"<br>";
echo "A divisão é ".$numero1 / $numero2;
echo"<br>";
echo"<br>";
echo "A subtração é ".$numero1 - $numero2;
echo"<br>";
echo"<br>";
echo "O resto do modulo é ".$numero1 % $numero2;
echo"<br>";
echo " =============================== ==========================================";
echo"<br>";
echo"==================OPERADORES DE COMPERAÇÃO =================<br>";

var_dump($numero2 === $numero1);
echo"<br>";
var_dump($numero2 == $numero1);
echo"<br>";
var_dump($numero2 != $numero1);

?>