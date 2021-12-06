<?php
    class Adresse{
        public $adressePrincipale;
        public $adresseSecondaire;
        public $emailPersonnel;
        public $emailInstitutionnel;
        public $telephonePortable;
        public $telephoneFixe;
        public $boitePostale;

        public function __construct($adressePrincipale, $adresseSecondaire, $emailPersonnel, $emailInstitutionnel, $telephonePortable, $telephoneFixe, $boitePostale){
            $this->adressePrincipale = $adressePrincipale;
            $this->adresseSecondaire = $adresseSecondaire;
            $this->emailPersonnel = $emailPersonnel;
            $this->emailInstitutionnel = $emailInstitutionnel;
            $this->telephonePortable = $telephonePortable;
            $this->telephoneFixe = $telephoneFixe;
            $this->boitePostale = $boitePostale;
        }
    }
?>