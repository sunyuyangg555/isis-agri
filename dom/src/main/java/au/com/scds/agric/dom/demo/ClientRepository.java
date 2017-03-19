package au.com.scds.agric.dom.demo;

import java.util.List;

import org.apache.isis.applib.annotation.DomainService;
import org.apache.isis.applib.annotation.NatureOfService;
import org.apache.isis.applib.query.QueryDefault;
import org.apache.isis.applib.services.registry.ServiceRegistry2;
import org.apache.isis.applib.services.repository.RepositoryService;

import au.com.scds.agric.dom.demo.data.Client;

@DomainService(nature = NatureOfService.DOMAIN, repositoryFor = Client.class)
public class ClientRepository {

	public List<Client> listAll() {
		return repositoryService.allInstances(Client.class);
	}

	public List<Client> findById(final String id) {
		return repositoryService.allMatches(new QueryDefault<>(Client.class, "findById", "id", id));
	}

	public Client create(String name) {
		final Client client = new Client();
		client.setName(name);
		serviceRegistry.injectServicesInto(client);
		repositoryService.persistAndFlush(client);
		return client;
	}

	@javax.inject.Inject
	RepositoryService repositoryService;
	@javax.inject.Inject
	ServiceRegistry2 serviceRegistry;
}