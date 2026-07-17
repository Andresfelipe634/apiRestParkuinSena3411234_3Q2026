package com.sena.parquiadero.dto;

import lombok.Data;

@Data
public class RegistroSalidaDTO {
	private Long idRegistro;
	private String placa;
	private Double valorCabrodo;
	private long horaEstadia;
}
