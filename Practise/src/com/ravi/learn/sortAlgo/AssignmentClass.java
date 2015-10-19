//package com.ravi.learn.sortAlgo;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//import org.json.JSONObject;
//
//public abstract class AssignmentClass {
//
//	public static void main(String[] args) {
//		final List<String> daasLpars = new ArrayList<String>();
//
////		final List<Map<String, Object>> list = "[{daasType=data_service, connectors=[{name=demo_connectors, version=1.2-SNAPSHOT, type=direct, supportedResources=[{name=DUMMY_RESOURCE, datagroups=[DUMMY_ONE_DG, DUMMY_TWO_DG]}]}, {name=zvm_dss_connectors, version=1.2-SNAPSHOT, type=dss, supportedResources=[{name=ZVM_GUESTS, datagroups=[GUEST_CPUS, GUEST_NETWORK]}]}], resources=[{name=STORAGE_RESOURCE, datagroups=[STORAGE_NFS, STORAGE_HFS], _links=[{rel=STORAGE_NFS;All_Lpars, href=/v1/daas/cecs/{cecSerial}/lpars/nfs/metrics, method=GET, parameters={}}, {rel=STORAGE_HFS;All_Lpars, href=/v1/daas/cecs/{cecSerial}/lpars/hfs/metrics, method=GET, parameters={}}]}], versionInfo={build=Continuous-1233, version=1.0.0-SNAPSHOT, buildTimestamp=2015-07-17T08:19:21-0400}, systemInfo={systemType=ZOS, UUID=12937192752, sysplexName=PLEXC1, lparName=CA11, zosName=CA11, cecSerialNumber=44D07}}, {daasType=data_collector, connectors=[{name=discovery_connectors, version=1.2-SNAPSHOT, type=direct, supportedResources=[{name=DISCOVERY_RESOURCE, datagroups=[CONNECTORS, SYSTEM_INFO]}]}, {name=zvm_dss_connectors, version=1.2-SNAPSHOT, type=dss, supportedResources=[{name=ZVM_GUESTS, datagroups=[GUEST_CPUS, GUEST_NETWORK]}]}], resources=[{name=STORAGE_RESOURCE, datagroups=[STORAGE_NFS, STORAGE_HFS], _links=[{rel=STORAGE_NFS;All_Lpars, href=/v1/daas/cecs/{cecSerial}/lpars/nfs/metrics, method=GET, parameters={}}, {rel=STORAGE_HFS;All_Lpars, href=/v1/daas/cecs/{cecSerial}/lpars/hfs/metrics, method=GET, parameters={}}]}], versionInfo={build=Continuous-1233, version=1.0.0-SNAPSHOT, buildTimestamp=2015-07-17T08:19:21-0400}, systemInfo={systemType=ZOS, UUID=12937192752, sysplexName=PLEXC1, lparName=CA11, zosName=CA11, cecSerialNumber=44D07}}]";
//		;
//		for (final Map<String, Object> map : list) {
//			final JSONObject json = new JSONObject(map.get("systemInfo")
//					.toString());
//			daasLpars.add(json.get("lparName").toString());
//		}
//	}
//
//}
