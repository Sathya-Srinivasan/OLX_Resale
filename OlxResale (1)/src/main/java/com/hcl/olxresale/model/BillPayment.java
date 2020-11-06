package com.hcl.olxresale.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/**
 * @author Sathya
 *
 */
@Entity
@Table(name = "billpayment")
public class BillPayment {
	@Id
	private int billId;
	@NotEmpty
	private String customerName;
	@NotEmpty
	private String startDate;
	@NotEmpty
	private String endDate;
	@NotEmpty
	private String source;
	@NotEmpty
	private String destination;
	@NotEmpty
	private int totalCost;

	public BillPayment() {
		super();
	}

	public BillPayment(int billId, String customerName, String startDate, String endDate, String source,
			String destination, int totalCost) {
		super();
		this.billId = billId;
		this.customerName = customerName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.source = source;
		this.destination = destination;
		this.totalCost = totalCost;
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}
}
