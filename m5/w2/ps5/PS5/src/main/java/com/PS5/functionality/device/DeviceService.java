package com.PS5.functionality.device;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.PS5.functionality.user.UserService;

import jakarta.persistence.EntityExistsException;

@Service
public class DeviceService {

	@Autowired
	DeviceRepository dispRepo;
	@Autowired
	UserService userRepo;

	public Device saveDispositivo(Device dispositivo) {
		return dispRepo.save(dispositivo);
	}

	public Device getDispositivoById(Long id) {
		if (!dispRepo.existsById(id)) {
			throw new EntityExistsException("Dispositivo non trovato");
		}
		return dispRepo.findById(id).get();
	}

	public List<Device> getAllDispositivo() {
		return (List<Device>) dispRepo.findAll();
	}

	public Device updateDispositivo(Device dispositivo) {
		if (!dispRepo.existsById(dispositivo.getId())) {
			throw new EntityExistsException("Dispositivo non trovato");
		}
		return dispRepo.save(dispositivo);
	}

	public String deleteDispositivo(Long id) {
		if (!dispRepo.existsById(id)) {
			throw new EntityExistsException("Dispositivo non trovato");
		}
		dispRepo.deleteById(id);
		return "Dispositivo eliminato";
	}
}
