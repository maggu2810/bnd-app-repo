
package tmp.bnd_app_repo.bundle3;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import tmp.bnd_app_repo.bundle1.Service;

@Component
public class ServiceConsumer {

    private @Reference Service service;

}
