package app.reception;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.reception.vo.WardVO;
import app.reception.vo.MedicalReceiptVO;
import app.reception.vo.MedicalRecordVO;
import app.reception.vo.PrescriptionVO;
import app.staff.vo.PatientVO;
import app.staff.vo.StaffVO;

@Service
public class AppReceptionServiceImpl implements AppReceptionService {
	
	@Autowired
	private AppReceptionDAO dao;

	@Override
	public StaffVO login_staff(Map<String, String> map) {
		return dao.login_staff(map);
	}

	@Override
	public List<PatientVO> search_patient(String name) {
			return dao.search_patient(name);
	}

	public List<MedicalReceiptVO> search_appointment(Map<String, String> map) {		
		return dao.search_appointment(map);
	}

	@Override
	public List<MedicalReceiptVO> search_patient_appointment(int id) {
		// TODO Auto-generated method stub
		return dao.search_patient_appointment(id);
	}

	@Override
	public List<MedicalRecordVO> search_medical_record(Map<String, Object> map) {
	
		return dao.search_medical_record(map);
	}

	@Override
	public List<PrescriptionVO> search_prescription(int id) {
		
		return dao.search_prescription(id);
	}

	@Override
	public List<PatientVO> search_patient_id(int id) {
		// TODO Auto-generated method stub
		return dao.search_patient_id(id);
	}

	public List<WardVO> search_ward(int id) {
		// TODO Auto-generated method stub
		return dao.search_ward(id);
	}
	

	@Override
	public List<MedicalRecordVO> search_appointment_department(Map<String, String> map) {
		// TODO Auto-generated method stub
		return dao.search_appointment_department(map);
	}

	@Override
	public List<MedicalRecordVO> search_medical_record_id(int id) {
		// TODO Auto-generated method stub
		return dao.search_medical_record_id(id);
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
		return dao.get_doctor_name(id);
	}






}
