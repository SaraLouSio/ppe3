/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

/**
 *
 * @author nc
 */
public class Personne {

    private Integer id;
    private String nom;
    private String prenom;
    private String courriel;
    private String adresseRue;
    private String adresseCp;
    private String adresseVille;
    private String telPerso;
    private String telPro;
    private String siteWeb;
    private String grade;
    private Integer id_grade;
    private String role;
    private Integer id_role;

    public Personne() {
    }

    public Personne(Integer id, String nom, String prenom, String courriel, String adresseRue, String adresseCp, String adresseVille, String telPerso, String telPro, String siteWeb, String grade, Integer id_grade, String role, Integer id_role) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.courriel = courriel;
        this.adresseRue = adresseRue;
        this.adresseCp = adresseCp;
        this.adresseVille = adresseVille;
        this.telPerso = telPerso;
        this.telPro = telPro;
        this.grade = grade;
        this.id_grade = id_grade;
        this.role = role;
        this.id_role = id_role;
        this.siteWeb = siteWeb;
    }

    public void modifPersonne(String nom, String prenom, String courriel, String adresseRue, String adresseCp, String adresseVille, String telPerso, String telPro) {
        this.nom = nom;
        this.prenom = prenom;
        this.courriel = courriel;
        this.adresseRue = adresseRue;
        this.adresseCp = adresseCp;
        this.adresseVille = adresseVille;
        this.telPerso = telPerso;
        this.telPro = telPro;
    }

    public Integer getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCourriel() {
        return courriel;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    public String getAdresseRue() {
        return adresseRue;
    }

    public void setAdresseRue(String adresseRue) {
        this.adresseRue = adresseRue;
    }

    public String getAdresseCp() {
        return adresseCp;
    }

    public void setAdresseCp(String adresseCp) {
        this.adresseCp = adresseCp;
    }

    public String getAdresseVille() {
        return adresseVille;
    }

    public void setAdresseVille(String adresseVille) {
        this.adresseVille = adresseVille;
    }

    public String getTelPerso() {
        return telPerso;
    }

    public void setTelPerso(String telPerso) {
        this.telPerso = telPerso;
    }

    public String getTelPro() {
        return telPro;
    }

    public void setTelPro(String telPro) {
        this.telPro = telPro;
    }

    public String getSiteWeb() {
        return siteWeb;
    }

    public void setSiteWeb(String siteWeb) {
        this.siteWeb = siteWeb;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Integer getId_grade() {
        return id_grade;
    }

    public void setId_grade(Integer id_grade) {
        this.id_grade = id_grade;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getId_role() {
        return id_role;
    }

    public void setId_role(Integer id_role) {
        this.id_role = id_role;
    }

}
