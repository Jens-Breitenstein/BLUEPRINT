package de._3oc_.t55bs.services;

import org.apache.tapestry5.ioc.Configuration;
import org.apache.tapestry5.services.LibraryMapping;

@SuppressWarnings("unused")
public class BootstrapCommonModule
{
    public static void contributeComponentClassResolver(final Configuration<LibraryMapping> configuration)
    {
        configuration.add(new LibraryMapping("t55bs", "de._3oc_.t55bs"));
    }
}
