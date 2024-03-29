package fr.eql.ai109.apptontapat.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "slope")
public class Slope implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/******************************************************************************************/
	/*                              Variable declaration                                      */
	/*****************************************************************************************/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "s_label")
	private String label;
	@OneToMany(mappedBy = "slope", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Field> fields;
	@OneToMany(mappedBy = "slope", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Race> races;

	/*****************************************************************************************/
	/*                                     Constructors                                      */
	/*****************************************************************************************/

	public Slope() {
		super();
	}

	public Slope(Integer id, String label, Set<Field> fields, Set<Race> races) {
		super();
		this.id = id;
		this.label = label;
		this.fields = fields;
		this.races = races;
	}

	/******************************************************************************************/
	/*                             Getters and setters                                        */
	/******************************************************************************************/

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Set<Field> getFields() {
		return fields;
	}

	public void setFields(Set<Field> fields) {
		this.fields = fields;
	}

	public Set<Race> getRaces() {
		return races;
	}

	public void setRaces(Set<Race> Races) {
		this.races = Races;
	}

}
