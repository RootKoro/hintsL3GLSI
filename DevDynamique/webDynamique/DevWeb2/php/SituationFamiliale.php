<?php
    class SituationFamiliale{
        public $situationMatrimoniale;
        public $nombreEnfant;

        public function __construct($situationMatrimoniale, $nombreEnfant){
            $this->situationMatrimoniale = $situationMatrimoniale;
            $this->nombreEnfant = $nombreEnfant;
        }
    }
?>