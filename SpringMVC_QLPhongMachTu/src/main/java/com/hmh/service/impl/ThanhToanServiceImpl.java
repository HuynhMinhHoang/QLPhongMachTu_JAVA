/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hmh.service.impl;

import com.hmh.pojo.HoaDon;
import com.hmh.pojo.LoaiThanhToan;
import com.hmh.pojo.PhieuDangKy;
import com.hmh.pojo.TaiKhoan;
import com.hmh.repository.ThanhToanRepository;
import com.hmh.service.ThanhToanService;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Asus
 */
@Service
public class ThanhToanServiceImpl implements ThanhToanService {

    @Autowired
    private ThanhToanRepository thanhToanRepository;

    @Override
    public List<HoaDon> getHoaDon(Map<String, String> params) {
        return this.thanhToanRepository.getHoaDon(params);
    }

    @Override
    public HoaDon getHoaDonById(int id) {
        return this.thanhToanRepository.getHoaDonById(id);
    }

    @Override
    public boolean xacNhanHD(int idHd, int loaiThanhToanId) {
        return this.thanhToanRepository.xacNhanHD(idHd, loaiThanhToanId);
    }

    @Override
    public List<HoaDon> timKiemPDK(Map<String, String> params) {
        return this.thanhToanRepository.timKiemPDK(params);
    }

    @Override
    public List<HoaDon> getHoaDonByBenhNhanId(TaiKhoan idBn) {
        return this.thanhToanRepository.getHoaDonByBenhNhanId(idBn);
    }

    @Override
    public List<LoaiThanhToan> getDSLoaiThanhToan() {
        return this.thanhToanRepository.getDSLoaiThanhToan();
    }

}
