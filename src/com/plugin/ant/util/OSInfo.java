package com.plugin.ant.util;

/**
 * 操作系统类：
 * 获取System.getProperty("os.name")对应的操作系统
 * @author isea533
 */
public class OSInfo {
	
	/**
	 * 操作系统名称
	 */
	private static String OS = System.getProperty("os.name").toLowerCase();
	
	/**
	 * 操作系统名称
	 */
	private static String OSVersion = System.getProperty("os.version").toLowerCase();
	
	/**
	 * 是否是linux
	 * @return true 是
	 */
	public static boolean isLinux(){
		return OS.indexOf("linux")>=0;
	}
	
	/**
	 * @return true 是
	 */
	public static boolean isMacOS(){
		return OS.indexOf("mac")>=0&&OS.indexOf("os")>0&&OS.indexOf("x")<0;
	}
	/**
	 * @return true 是
	 */
	public static boolean isMacOSX(){
		return OS.indexOf("mac")>=0&&OS.indexOf("os")>0&&OS.indexOf("x")>0;
	}
	/**
	 * 是否是windows
	 * @return true 是
	 */
	public static boolean isWindows(){
		return OS.indexOf("windows")>=0;
	}
	
	/**
	 * 是否是windows 内核6或以上的
	 * @return true 是
	 */
	public static boolean isWindows6(){
		if(OS.indexOf("windows")>=0){
			 try {  
		        double version = Double.parseDouble(OSVersion);  
		        if(version>6){
		        	return true;
		        }
		     } catch (NumberFormatException e) {  
		         return false;  
		     }  
		}
		return false;
	}
	
	/**
	 * @return true 是
	 */
	public static boolean isOS2(){
		return OS.indexOf("os/2")>=0;
	}
	/**
	 * @return true 是
	 */
	public static boolean isSolaris(){
		return OS.indexOf("solaris")>=0;
	}
	/**
	 * @return true 是
	 */
	public static boolean isSunOS(){
		return OS.indexOf("sunos")>=0;
	}
	/**
	 * @return true 是
	 */
	public static boolean isMPEiX(){
		return OS.indexOf("mpe/ix")>=0;
	}
	/**
	 * @return true 是
	 */
	public static boolean isHPUX(){
		return OS.indexOf("hp-ux")>=0;
	}
	/**
	 * @return true 是
	 */
	public static boolean isAix(){
		return OS.indexOf("aix")>=0;
	}
	/**
	 * @return true 是
	 */
	public static boolean isOS390(){
		return OS.indexOf("os/390")>=0;
	}
	/**
	 * @return true 是
	 */
	public static boolean isFreeBSD(){
		return OS.indexOf("freebsd")>=0;
	}
	/**
	 * @return true 是
	 */
	public static boolean isIrix(){
		return OS.indexOf("irix")>=0;
	}
	/**
	 * @return true 是
	 */
	public static boolean isDigitalUnix(){
		return OS.indexOf("digital")>=0&&OS.indexOf("unix")>0;
	}
	/**
	 * @return true 是
	 */
	public static boolean isNetWare(){
		return OS.indexOf("netware")>=0;
	}
	/**
	 * @return true 是
	 */
	public static boolean isOSF1(){
		return OS.indexOf("osf1")>=0;
	}
	/**
	 * @return true 是
	 */
	public static boolean isOpenVMS(){
		return OS.indexOf("openvms")>=0;
	}
	
	/**
	 * @param args 参数
	 */
	public static void main(String[] args) {
		System.out.println(System.getProperty("os.version").toLowerCase());
		
	}
}