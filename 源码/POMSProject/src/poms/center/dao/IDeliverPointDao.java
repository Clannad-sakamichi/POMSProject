package poms.center.dao;

import java.util.List;

import poms.center.entity.DeliverPoint;


public interface IDeliverPointDao {
	
	public int insertDeliverPoint(DeliverPoint deliverPoint);
	public int updateDeliverPoint(DeliverPoint deliverPoint);
	public List<DeliverPoint> selectDeliverPointByID(int deliverPointID);
	public List<DeliverPoint> selectAllDeliverPoint(int stationID);
	public int deleteDeliverPointByID(int deliverPointID);

}
