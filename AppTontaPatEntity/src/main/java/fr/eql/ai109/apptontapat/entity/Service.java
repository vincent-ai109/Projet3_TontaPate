package fr.eql.ai109.apptontapat.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "service")
public class Service implements Serializable{

	private static final long serialVersionUID = 1L;

	/******************************************************************************************/
	/*                              Variable declaration                                      */
	/*****************************************************************************************/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "s_nb_service")
	private Integer nbService;
	@Column(name = "s_cost")
	private Integer cost;
	@Column(name = "s_qrcode") 
	private String qrCode;
	@Column(name = "s_starting") 
	private Date starting;
	@Column(name = "s_booking") 
	private Date booking;
	@Column(name = "s_ending") 
	private Date ending;
	@Column(name = "s_validation") 
	private Date validation;
	@Column(name = "s_payment")
	private Date payment;
	@Column(name = "s_finished")
	private Date finished;
	@Column(name = "s_rate_date")
	private Date rateDate;
	@Column(name = "s_rate_note")
	private Integer rateNote;
	@Column(name = "s_rate_comment")
	private String rateComment;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Rupture rupture;
	@OneToMany(mappedBy = "service", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Clocking> clockings;
	
	@OneToMany(mappedBy = "service", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Incident> incident;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Refusal refusal;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Herd herd;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id")
	private Field field;

	/*****************************************************************************************/
	/*                                     Constructors                                      */
	/*****************************************************************************************/

	public Service(Integer nbService, Integer cost, String qrCode, Date starting) {
		super();
		this.nbService = nbService;
		this.cost = cost;
		this.qrCode = qrCode;
		this.starting = starting;
	}

	public Service() {
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

	public Integer getNbService() {
		return nbService;
	}

	public void setNbService(Integer nbService) {
		this.nbService = nbService;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public Date getStarting() {
		return starting;
	}

	public void setStarting(Date starting) {
		this.starting = starting;
	}

	public Date getBooking() {
		return booking;
	}

	public void setBooking(Date booking) {
		this.booking = booking;
	}

	public Date getEnding() {
		return ending;
	}

	public void setEnding(Date ending) {
		this.ending = ending;
	}

	public Date getValidation() {
		return validation;
	}

	public void setValidation(Date validation) {
		this.validation = validation;
	}

	public Date getPayment() {
		return payment;
	}

	public void setPayment(Date payment) {
		this.payment = payment;
	}

	public Date getFinished() {
		return finished;
	}

	public void setFinished(Date finished) {
		this.finished = finished;
	}

	public Date getRateDate() {
		return rateDate;
	}

	public void setRateDate(Date rateDate) {
		this.rateDate = rateDate;
	}

	/*public Rupture getRupture() {
		return rupture;
	}

	public void setRupture(Rupture rupture) {
		this.rupture = rupture;
	}

	public Incident getIncident() {
		return incident;
	}

	public void setIncident(Incident incident) {
		this.incident = incident;
	}

	public Refusal getRefusal() {
		return refusal;
	}

	public void setRefusal(Refusal refusal) {
		this.refusal = refusal;
	}

	public Clocking getClocking() {
		return clocking;
	}

	public void setClocking(Clocking clocking) {
		this.clocking = clocking;
	}

	public Integer getRateNote() {
		return rateNote;
	}

	public void setRateNote(Integer rateNote) {
		this.rateNote = rateNote;
	}

	public String getRateComment() {
		return rateComment;
	}

	public void setRateComment(String rateComment) {
		this.rateComment = rateComment;
	}*/


}
