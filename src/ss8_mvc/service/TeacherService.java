package ss8_mvc.service;

import ss8_mvc.entity.Teacher;
import ss8_mvc.repository.ITeacherRepository;
import ss8_mvc.repository.TeacherRepository;

public class TeacherService implements ITeacherService{
    private ITeacherRepository teacherRepository = new TeacherRepository();
    @Override
    public Teacher[] getAll() {
        return teacherRepository.getAll();
    }
}
