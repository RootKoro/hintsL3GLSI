<?php
    class Bourse{
        public $bourse;
        public $natureBourse;
        public $montantBourse;

        public function __construct($bourse, $natureBourse, $montantBourse){
            $this->bourse = $bourse;
            $this->natureBourse = $natureBourse;
            $this->montantBourse = $montantBourse;
        }
    }
?>