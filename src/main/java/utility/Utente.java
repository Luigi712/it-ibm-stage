package utility;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Utente {
	private String nome;
    private String cognome;
    private String sesso;
    private Integer eta;
    
    
    //Metodo di prova per Junit
    public int addizione(int num1, int num2) {
    	return num1+num2;
    }

    public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

    public Utente() {
    }
    
    @XmlElement
	public String getNome() {
		return nome;
	}

	public void setName(String nome) {
		this.nome = nome;
	}
	
	@XmlElement
	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	@XmlTransient
	public String getSesso() {
		return sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

}
