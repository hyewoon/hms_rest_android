package app.reception;

import java.util.List;
import java.util.Map;

import app.reception.vo.WardVO;
import app.reception.vo.MedicalReceiptVO;
import app.reception.vo.MedicalRecordVO;
import app.reception.vo.PrescriptionVO;
import app.staff.vo.PatientVO;
import app.staff.vo.StaffVO;

public interface AppReceptionService {
	
	public StaffVO login_staff(Map<String, String> map);  	//로그인
	public List<PatientVO> search_patient(String name);		//환자이름검색
	public List<PatientVO> search_patient_id(int id);	//환자아이디 검색

	
	public List<MedicalReceiptVO> search_patient_appointment(int id); //예약정보 검색
	public List<StaffVO>get_doctor_name(int id); //의사이름 검색

	public List<MedicalRecordVO> search_medical_record(Map<String, Object> map);//진료이력조회 by map
	public List<MedicalRecordVO> search_medical_record_id(int id);	//진료이력 
	public List<PrescriptionVO> search_prescription(int id);				 //처방정보조회
	public List<WardVO> search_Ward(int id); 							//입원 내역 조회
	
	
	public List<MedicalRecordVO> search_appointment_department(Map<String, String> map); //예약정보리스트 검색
	public List<MedicalReceiptVO> search_doctor(String doctor);

	

	

}
