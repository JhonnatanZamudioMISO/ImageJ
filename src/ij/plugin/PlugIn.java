package ij.plugin;

/** Plugins that acquire images or display windows should
	implement this interface. Plugins that process images 
	should implement the PlugInFilter interface. */
public interface PlugIn {
	public void run(String arg);
}
