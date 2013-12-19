package com.vgsc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.vgsc.model.RequestKpi;;

/**
 * This class is for getting the requestKpi data from database.
 */
public class ServiceDAO {

	/**
	 * This method is written for retrieving the ReqKPIResults(Telesur Project).
	 * @param connection
	 * @return ArrayList(ReqKPI)
	 * @throws Exception
	 */
	public ArrayList<RequestKpi> getReqKPI(Connection connection) throws Exception {

		ArrayList<RequestKpi> kpiData = new ArrayList<RequestKpi>();
		try {
			PreparedStatement ps = connection
					.prepareStatement("select * from requestKpi");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				RequestKpi kpi = new RequestKpi();
				kpi.setTime(rs.getString("time"));
				kpi.setNetworkCategory(rs.getString("nwCategory"));
				kpi.setNetworkDevice(rs.getString("nwDevice"));
				kpi.setOriginatingNetwork(rs.getString("orgNw"));
				kpi.setTerminatingNetwork(rs.getString("trmNw"));
				kpi.setFromNumber(rs.getString("fromNum"));
				kpi.setToNumber(rs.getString("toNum"));
				kpi.setStatus(rs.getString("status"));
				kpi.setSER(rs.getString("SER"));
				kpi.setSEER(rs.getString("SEER"));
				kpi.setSDF(rs.getString("SDF"));
				kpi.setCNAR(rs.getString("CNAR"));
				kpi.setMOS(rs.getString("MOS"));
				kpi.setMOU(rs.getString("MOU"));
				kpiData.add(kpi);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return kpiData;
	}

}