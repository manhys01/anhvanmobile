package poly.agile.webapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
	
	private Integer id;
	private String brand;
	private String name;
	private Integer price;
	private Integer qtyInStock;
	private String shortDescription;
	private String thumbnail;
	
}
