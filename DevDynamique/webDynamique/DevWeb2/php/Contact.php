<?php 
    class Contact{
        public $nom;
        public $prenom;
        public $adresse;
        public $ville;
        public $telephonePortable;
        public $telephoneFixe;
        public $emailPersonnel;
        public $boitePostale;
        public $fax;
        public $responsableEtudiant;
        public $contact;

        public function __construct($nom, $prenom, $adresse, $ville, $telephonePortable, $telephoneFixe, $emailPersonnel, $boitePostale, $fax, $responsableEtudiant, $contact){
            $this->nom = $nom;
            $this->prenom = $prenom;
            $this->adresse = $adresse;
            $this->ville = $ville;
            $this->telephonePortable = $telephonePortable;
            $this->telephoneFixe = $telephoneFixe;
            $this->emailPersonnel = $emailPersonnel;
            $this->boitePostale = $boitePostale;
            $this->fax = $fax;
            $this->responsableEtudiant = $responsableEtudiant;
            $this->contact = $contact;
        }
    }
?>