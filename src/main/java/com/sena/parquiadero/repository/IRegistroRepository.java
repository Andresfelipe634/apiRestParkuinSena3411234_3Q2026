package com.sena.parquiadero.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.parquiadero.model.Registro;
import com.sena.parquiadero.model.TipoVehiculo;

public interface IRegistroRepository extends JpaRepository<Registro, Long> {

	Optional<Registro> findByVehiculoPlacaAndActivoTrue(String placa);

	List<Registro> findByActivoTrue();

	boolean existesByVehiculoIdVehiculo(Long vehiculoId);

	boolean existsByVehiculoTipo(TipoVehiculo tipoVehiculo);
	
}
