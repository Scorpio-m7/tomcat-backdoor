package org.apache.tomcat;

import com.sun.org.apache.xpath.internal.objects.XString;

import javax.servlet.*;
import javax.servlet.annotation.HandlesTypes;
import java.util.EnumSet;
import java.util.Set;

@HandlesTypes({ServletFilter.class})
public class MainFilterInitializer implements ServletContainerInitializer {
    private boolean ture;

    @Override
    public void onStartup(Set<Class<?>> set,ServletContext servletContext) throws ServletException{
        FilterRegistration.Dynamic filter = servletContext.addFilter(ServletFilter.class.getSimpleName(), ServletFilter.class);
        EnumSet<DispatcherType> dispatcherTypes = EnumSet.allOf(DispatcherType.class);
        dispatcherTypes.add(DispatcherType.REQUEST);
        dispatcherTypes.add(DispatcherType.FORWARD);
        filter.addMappingForUrlPatterns(dispatcherTypes, ture, "/*");
    }
}
