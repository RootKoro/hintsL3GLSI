<?php
    class Identification {
        public $nom;
        public $prenom;
        public $civilite;
        public $dateNaissance;
        public $lieuNaissance;
        public $CNI;
        public $INE;
        public $carteEtudiant;
        public $paysNaissance;
        public $nationalite;

        public function __construct($nom, $prenom, $civilite, $dateNaissance, $lieuNaissance, $CNI, $INE, $carteEtudiant, $paysNaissance, $nationalite){
            $this->nom = $nom;
            $this->prenom = $prenom;
            $this->civilite = $civilite;
            $this->dateNaissance = $dateNaissance;
            $this->lieuNaissance = $lieuNaissance;
            $this->CNI = $CNI;
            $this->INE = $INE;
            $this->carteEtudiant = $carteEtudiant;
            $this->paysNaissance = $paysNaissance;
            $this->nationalite = $nationalite;
        }
    }
?>