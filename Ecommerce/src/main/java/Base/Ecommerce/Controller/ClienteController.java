package Base.Ecommerce.Controller;

import Base.Ecommerce.Entity.Cliente;
import Base.Ecommerce.Services.ClienteServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "Cliente")
public class ClienteController extends BaseControllerImpl<Cliente, ClienteServiceImpl>{
}
