/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hmh.repository;

import com.hmh.pojo.HoaDon;
import com.hmh.pojo.LoaiThanhToan;
import com.hmh.pojo.PhieuDangKy;
import com.hmh.pojo.TaiKhoan;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Asus
 */
public interface ThanhToanRepository {

    public List<HoaDon> getHoaDon(Map<String, String> params);

    HoaDon getHoaDonById(int id);

    boolean xacNhanHD(int idHd, int loaiThanhToanId);

    List<HoaDon> timKiemPDK(Map<String, String> params);

    List<HoaDon> getHoaDonByBenhNhanId(TaiKhoan idBn);

    List<LoaiThanhToan> getDSLoaiThanhToan();
}
