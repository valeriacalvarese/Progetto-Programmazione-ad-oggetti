package model.facebook;


/**
 *   
* @author Valeria Calvarese
*
*/

public class Metadati 

/**Classe che restiuisce i metadati(formato json), ovvero l'elenco degli attributi e del tipo della classe;
 * 
 */
{ 
	private String name; //nome campo
	private String type; //tipo campo
	private String property; //descrizione campo
	private String story;
	
	/** costuttore della classe
	 * @param name, name del dato
	 * @param type, tipo di caratteristica
	 * @param property, significato
	 * 
	 * 
	 */
	public Metadati(String name, String type, String property)
	{
		this.name = name;
		this.type =type;
		this.property= property;
	}

	/**  metodi Getters and Setters
	 * 
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}
	

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	@Override
	
	/**Override del metodo toString
	 * 
	 */
	
	public String toString() {
		return this.getName()+ ":"+this.getProperty()+"\n"+this.getType()+ "\n" + this.getStory();
	}
	
	

}
