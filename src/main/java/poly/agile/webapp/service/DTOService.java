package poly.agile.webapp.service;

import org.springframework.data.domain.Page;

public interface DTOService<DTO> {
	
	Page<DTO> getPages(int page, int size);
	
}
