package app.reception;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import app.reception.vo.WardVO;
import app.reception.vo.MedicalReceiptVO;
import app.reception.vo.MedicalRecordVO;
import app.reception.vo.PrescriptionVO;
import app.staff.vo.PatientVO;
import app.staff.vo.StaffVO;

@Repository
public class AppReceptionDAO implements AppReceptionService {
	
	@Autowired
	@Qualifier("cteam")
	private SqlSession sql;

	@Override
	public StaffVO login_staff(Map<String, String> map) {
		return sql.selectOne("re.login", map);
	}

	@Override
	public List<PatientVO> search_patient(String name) {
		return sql.selectList("re.patient", name);
	}

	public List<MedicalReceiptVO> search_appointment(Map<String, String> map) {
		return sql.selectList("re.appointment", map);
	}

	@Override
	public List<MedicalReceiptVO> search_patient_appointment(int id) {
		
		return sql.selectList("re.patient_appointment", id);
	}

	@Override
	public List<MedicalRecordVO> search_medical_record(Map<String, Object> map) {
	
		return sql.selectList("re.medical_record",map);
	}

	@Override
	public List<PrescriptionVO> search_prescription(int id) {

		return sql.selectList("re.prescription", id);
	}

	@Override
	public List<PatientVO> search_patient_id(int id) {
		// TODO Auto-generated method stub
		return sql.selectList("re.id", id);
	}

	public List<WardVO> search_ward(int id) {
		// TODO Auto-generated method stub
		return sql.selectList("re.ward", id);
	}

		

	@Override
	public List<MedicalRecordVO> search_appointment_department(Map<String, String> map) {
		// TODO Auto-generated method stub
		return sql.selectList("re.department", map);
	}

	@Override
	public List<MedicalRecordVO> search_medical_record_id(int id) {
		// TODO Auto-generated method stub
		return sql.selectList("re.meidcal_record_id", id);
	}

	@Override
	public List<WardVO> search_Ward(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MedicalReceiptVO> search_doctor(String doctor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StaffVO> get_doctor_name(int id) {
		// TODO Auto-generated method stub
		return sql.selectList("re.get_doctor_name",id);
	}




}
