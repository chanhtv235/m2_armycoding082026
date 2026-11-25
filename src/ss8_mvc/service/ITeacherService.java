package ss8_mvc.service;

import ss8_mvc.entity.Teacher;

public interface ITeacherService extends IService<Teacher> {
    boolean checkStudent();
}
