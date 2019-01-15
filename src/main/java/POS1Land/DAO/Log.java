package POS1Land.DAO;

import java.sql.Date;
import java.util.Calendar;

public class Log {
    private int id;
    private String variante;
    private double betrag;
    private double ergebnis;
    private Date date;


    public Log(int id, String variante, double betrag, double ergebnis, Date date) {

        this.id = id;
        this.variante = variante;
        this.betrag = betrag;
        this.ergebnis = ergebnis;
        this.date = date;
    }

    public Log(String variante, double betrag, double ergebnis) {
        this.variante = variante;
        this.betrag = betrag;
        this.ergebnis = ergebnis;
        this.date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVariante() {
        return variante;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }

    public double getBetrag() {
        return betrag;
    }

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }

    public double getErgebnis() {
        return ergebnis;
    }

    public void setErgebnis(double ergebnis) {
        this.ergebnis = ergebnis;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
