<?php
    class Emploi{
        public $activiteSalarie;
        public $statutEtudiant;
        public $categorieSocioPro;

        public function __construct($activiteSalarie, $statutEtudiant, $categorieSocioPro){
            $this->activiteSalarie = $activiteSalarie;
            $this->statutEtudiant = $statutEtudiant;
            $this->categorieSocioPro = $categorieSocioPro;
        }
    }
?>