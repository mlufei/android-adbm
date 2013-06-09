package com.matoski.adbm;

public class Constants {

	public final static boolean START_ON_BOOT = true;
	public final static boolean ADB_START_ON_KNOWN_WIFI = false;
	public final static int DELAY_START_AFTER_BOOT = 30;
	public final static int CHECK_IF_STARTED_INTERVAL = 30;
	public final static int ALARM_TIMEOUT_INTERVAL = 30;
	public final static long ADB_PORT = 5555;
	public final static boolean SHOW_NOTIFICATIONS = true;
	
	public final static String KEY_ALARM_TIMEOUT_INTERVAL = "alarm_timeout_interval";
	public final static String KEY_START_DELAY = "start_delay";
	public final static String KEY_START_ON_BOOT = "start_on_boot";
	public final static String KEY_ADB_PORT = "adb_port";
	public final static String KEY_ADB_START_ON_KNOWN_WIFI = "auto_start_on_known_wifi";
	public final static String KEY_NOTIFICATIONS = "show_notifications";
	public final static String KEY_WIFI_LIST = "wifi_list";
	public final static String KEY_WIFI_LIST_ENTRIES = "wifi_list_entries";
	public static final String EXTRA_ACTION = "action";
	
	public static final String KEY_ACTION_AUTO_WIFI = "AUTO_WIFI_CONNECT";
	public static final String KEY_ACTION_ADB_STOP = "ADB_STOP";
	public static final String KEY_ACTION_ADB_START = "ADB_START";
	public static final String KEY_ACTION_UPDATE_NOTIFICATION = "UPDATE_NOTIFICATION";

}