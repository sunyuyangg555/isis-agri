/*
MIT License

Copyright (c) 2017 Alexander Stephen Cameron (http://stephencamerondataservices.com.au/)

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

package au.com.scds.agric.dom.demo;

import java.util.List;

import org.apache.isis.applib.annotation.DomainService;
import org.apache.isis.applib.annotation.NatureOfService;
import org.apache.isis.applib.query.QueryDefault;
import org.apache.isis.applib.services.registry.ServiceRegistry2;
import org.apache.isis.applib.services.repository.RepositoryService;

import au.com.scds.agric.dom.demo.data.SiUnit;

@DomainService(nature = NatureOfService.DOMAIN, repositoryFor = SiUnit.class)
public class SiUnitRepository {

	public SiUnit createSiUnit(String unitName) {
		if (unitName == null)
			return null;
		final SiUnit SiUnit = new SiUnit();
		SiUnit.setName(unitName);
		serviceRegistry.injectServicesInto(SiUnit);
		repositoryService.persistAndFlush(SiUnit);
		return SiUnit;
	}
	
	public List<SiUnit> listAll() {
		return repositoryService.allInstances(SiUnit.class);
	}
	
	public SiUnit findById(final String id) {
		return repositoryService.firstMatch(new QueryDefault<>(SiUnit.class, "findById", "id", id));
	}

	@javax.inject.Inject
	RepositoryService repositoryService;
	@javax.inject.Inject
	ServiceRegistry2 serviceRegistry;
}