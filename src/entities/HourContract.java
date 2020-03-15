package entities;

import java.util.Date;

public class HourContract {

	private Date data;
	private Double valorPorHora;
	private Integer horas;

	public HourContract() {
	}

	public HourContract(Date data, Double valorPorHora, Integer horas) {
		this.data = data;
		this.valorPorHora = valorPorHora;
		this.horas = horas;
	}

	public Double totalValue() {
		return valorPorHora * horas;
	}

	public Integer getHoras() {
		return horas;
	}

	public void SetHoras(Integer horas) {
		this.horas = horas;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

}
