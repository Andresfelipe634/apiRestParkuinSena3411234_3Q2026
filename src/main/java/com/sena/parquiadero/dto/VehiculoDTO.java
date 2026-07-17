package com.sena.parquiadero.dto;

import com.sena.parquiadero.model.TipoVehiculo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class VehiculoDTO {
	private Long idVehiculo;
	@NotBlank(message = "La placa es obligatoria")
	@Pattern(regexp = "^[A-Za-z0-9 -]{3,10}$", message = "Froato de placa invalido")
	private String placa;
	@NotNull(message = "El tipo de vihuculo es obliggatario")
	private TipoVehiculo tipo;
	private String marca;
	private String modelo;
}
