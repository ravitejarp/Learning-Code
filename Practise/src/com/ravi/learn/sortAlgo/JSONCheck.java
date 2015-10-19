package com.ravi.learn.sortAlgo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONCheck {

	public static void main(String[] args) throws JSONException {

		String s = "{\r\n"
				+ "   \"apiMessage\":{\r\n"
				+ "      \"metadata\":{\r\n"
				+ "         \"messageVersion\":\"1\",\r\n"
				+ "         \"messageTime\":\"2014-01-22T12:33-04:00\",\r\n"
				+ "         \"resourceTypes\":[\r\n"
				+ "            \"discovery\"\r\n"
				+ "         ]\r\n"
				+ "      },\r\n"
				+ "      \"data\":{\r\n"
				+ "         \"discovery\":[\r\n"
				+ "            {\r\n"
				+ "               \"daasType\":\"data_service\",\r\n"
				+ "               \"connectors\":[\r\n"
				+ "                  {\r\n"
				+ "                     \"name\":\"demo_connectors\",\r\n"
				+ "                     \"version\":\"1.2-SNAPSHOT\",\r\n"
				+ "                     \"type\":\"direct\",\r\n"
				+ "                     \"supportedResources\":[\r\n"
				+ "                        {\r\n"
				+ "                           \"name\":\"DUMMY_RESOURCE\",\r\n"
				+ "                           \"datagroups\":[\r\n"
				+ "                              \"DUMMY_ONE_DG\",\r\n"
				+ "                              \"DUMMY_TWO_DG\"\r\n"
				+ "                           ]\r\n"
				+ "                        }\r\n"
				+ "                     ]\r\n"
				+ "                  },\r\n"
				+ "                  {\r\n"
				+ "                     \"name\":\"zvm_dss_connectors\",\r\n"
				+ "                     \"version\":\"1.2-SNAPSHOT\",\r\n"
				+ "                     \"type\":\"dss\",\r\n"
				+ "                     \"supportedResources\":[\r\n"
				+ "                        {\r\n"
				+ "                           \"name\":\"ZVM_GUESTS\",\r\n"
				+ "                           \"datagroups\":[\r\n"
				+ "                              \"GUEST_CPUS\",\r\n"
				+ "                              \"GUEST_NETWORK\"\r\n"
				+ "                           ]\r\n"
				+ "                        }\r\n"
				+ "                     ]\r\n"
				+ "                  }\r\n"
				+ "               ],\r\n"
				+ "               \"resources\":[\r\n"
				+ "                  {\r\n"
				+ "                     \"name\":\"STORAGE_RESOURCE\",\r\n"
				+ "                     \"datagroups\":[\r\n"
				+ "                        \"STORAGE_NFS\",\r\n"
				+ "                        \"STORAGE_HFS\"\r\n"
				+ "                     ],\r\n"
				+ "                     \"_links\":[\r\n"
				+ "                        {\r\n"
				+ "                           \"rel\":\"STORAGE_NFS;All_Lpars\",\r\n"
				+ "                           \"href\":\"/v1/daas/cecs/{cecSerial}/lpars/nfs/metrics\",\r\n"
				+ "                           \"method\":\"GET\",\r\n"
				+ "                           \"parameters\":{\r\n"
				+ "                           }\r\n"
				+ "                        },\r\n"
				+ "                        {\r\n"
				+ "                           \"rel\":\"STORAGE_HFS;All_Lpars\",\r\n"
				+ "                           \"href\":\"/v1/daas/cecs/{cecSerial}/lpars/hfs/metrics\",\r\n"
				+ "                           \"method\":\"GET\",\r\n"
				+ "                           \"parameters\":{\r\n"
				+ "                           }\r\n"
				+ "                        }\r\n"
				+ "                     ]\r\n"
				+ "                  }\r\n"
				+ "               ],\r\n"
				+ "               \"versionInfo\":{\r\n"
				+ "                  \"build\":\"Continuous-1233\",\r\n"
				+ "                  \"version\":\"1.0.0-SNAPSHOT\",\r\n"
				+ "                  \"buildTimestamp\":\"2015-07-17T08:19:21-0400\"\r\n"
				+ "               },\r\n"
				+ "               \"systemInfo\":{\r\n"
				+ "                  \"systemType\":\"ZOS\",\r\n"
				+ "                  \"UUID\":\"12937192752\",\r\n"
				+ "                  \"sysplexName\":\"PLEXC1\",\r\n"
				+ "                  \"lparName\":\"CA11\",\r\n"
				+ "                  \"zosName\":\"CA11\",\r\n"
				+ "                  \"cecSerialNumber\":\"44D07\"\r\n"
				+ "               }\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "               \"daasType\":\"data_collector\",\r\n"
				+ "               \"connectors\":[\r\n"
				+ "                  {\r\n"
				+ "                     \"name\":\"discovery_connectors\",\r\n"
				+ "                     \"version\":\"1.2-SNAPSHOT\",\r\n"
				+ "                     \"type\":\"direct\",\r\n"
				+ "                     \"supportedResources\":[\r\n"
				+ "                        {\r\n"
				+ "                           \"name\":\"DISCOVERY_RESOURCE\",\r\n"
				+ "                           \"datagroups\":[\r\n"
				+ "                              \"CONNECTORS\",\r\n"
				+ "                              \"SYSTEM_INFO\"\r\n"
				+ "                           ]\r\n"
				+ "                        }\r\n"
				+ "                     ]\r\n"
				+ "                  },\r\n"
				+ "                  {\r\n"
				+ "                     \"name\":\"zvm_dss_connectors\",\r\n"
				+ "                     \"version\":\"1.2-SNAPSHOT\",\r\n"
				+ "                     \"type\":\"dss\",\r\n"
				+ "                     \"supportedResources\":[\r\n"
				+ "                        {\r\n"
				+ "                           \"name\":\"ZVM_GUESTS\",\r\n"
				+ "                           \"datagroups\":[\r\n"
				+ "                              \"GUEST_CPUS\",\r\n"
				+ "                              \"GUEST_NETWORK\"\r\n"
				+ "                           ]\r\n"
				+ "                        }\r\n"
				+ "                     ]\r\n"
				+ "                  }\r\n"
				+ "               ],\r\n"
				+ "               \"resources\":[\r\n"
				+ "                  {\r\n"
				+ "                     \"name\":\"STORAGE_RESOURCE\",\r\n"
				+ "                     \"datagroups\":[\r\n"
				+ "                        \"STORAGE_NFS\",\r\n"
				+ "                        \"STORAGE_HFS\"\r\n"
				+ "                     ],\r\n"
				+ "                     \"_links\":[\r\n"
				+ "                        {\r\n"
				+ "                           \"rel\":\"STORAGE_NFS;All_Lpars\",\r\n"
				+ "                           \"href\":\"/v1/daas/cecs/{cecSerial}/lpars/nfs/metrics\",\r\n"
				+ "                           \"method\":\"GET\",\r\n"
				+ "                           \"parameters\":{\r\n"
				+ "                           }\r\n"
				+ "                        },\r\n"
				+ "                        {\r\n"
				+ "                           \"rel\":\"STORAGE_HFS;All_Lpars\",\r\n"
				+ "                           \"href\":\"/v1/daas/cecs/{cecSerial}/lpars/hfs/metrics\",\r\n"
				+ "                           \"method\":\"GET\",\r\n"
				+ "                           \"parameters\":{\r\n"
				+ "                           }\r\n"
				+ "                        }\r\n"
				+ "                     ]\r\n"
				+ "                  }\r\n"
				+ "               ],\r\n"
				+ "               \"versionInfo\":{\r\n"
				+ "                  \"build\":\"Continuous-1233\",\r\n"
				+ "                  \"version\":\"1.0.0-SNAPSHOT\",\r\n"
				+ "                  \"buildTimestamp\":\"2015-07-17T08:19:21-0400\"\r\n"
				+ "               },\r\n"
				+ "               \"systemInfo\":{\r\n"
				+ "                  \"systemType\":\"ZOS\",\r\n"
				+ "                  \"UUID\":\"12937192752\",\r\n"
				+ "                  \"sysplexName\":\"PLEXC1\",\r\n"
				+ "                  \"lparName\":\"CA31\",\r\n"
				+ "                  \"zosName\":\"CA11\",\r\n"
				+ "                  \"cecSerialNumber\":\"44D07\"\r\n"
				+ "               }\r\n" + "            }\r\n"
				+ "         ],\r\n" + "         \"messages\":[\r\n"
				+ "         ]\r\n" + "      }\r\n" + "   }\r\n" + "}";

		JSONObject json = new JSONObject(s);
		JSONObject jsonObject = json.getJSONObject("apiMessage");
		JSONArray jsonArray = jsonObject.getJSONObject("data").getJSONArray(
				"discovery");
		// System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++)
			System.out.println(jsonArray.getJSONObject(i)
					.getJSONObject("systemInfo").get("lparName"));

	}
}
