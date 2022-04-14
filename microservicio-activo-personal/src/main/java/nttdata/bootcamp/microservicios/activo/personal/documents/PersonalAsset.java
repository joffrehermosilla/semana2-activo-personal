package nttdata.bootcamp.microservicios.activo.personal.documents;



import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Document(collection = "personal-asset")
public class PersonalAsset {
	@Id
	private String id;
	
	private Double totalAmount;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createAt;

	
	

}
