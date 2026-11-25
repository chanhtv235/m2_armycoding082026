package ss8_mvc.service;

import ss8_mvc.entity.Teacher;
import ss8_mvc.repository.ITeacherRepository;
import ss8_mvc.repository.TeacherRepository;

import java.util.List;

public class TeacherService implements ITeacherService{
    private ITeacherRepository teacherRepository = new TeacherRepository();

    @Override
    public List<Teacher> getAll() {

        return List.of();
    }

    @Override
    public List<Teacher> searchByName() {
        return List.of();
    }

    @Override
    public void add(Teacher teacher) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public boolean checkStudent() {
        //
        return false;
    }
}
