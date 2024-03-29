/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hmh.controllers;

import com.hmh.pojo.ChiTietDv;
import com.hmh.pojo.ChiTietThoiGianTruc;
import com.hmh.pojo.PhieuDangKy;
import com.hmh.pojo.TaiKhoan;
import com.hmh.service.ChiTietDVService;
import com.hmh.service.LichTrucService;
import com.hmh.service.PhieuDangKyService;
import com.hmh.service.QuanLyTaiKhoanService;
import com.hmh.service.QuanLyThuocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Asus
 */
@RestController
//@RequestMapping("/api")
public class ApiQuanLyAdminController {

    @Autowired
    private QuanLyTaiKhoanService quanLyTaiKhoanService;
    @Autowired
    private QuanLyThuocService quanLyThuocService;

    @Autowired
    private LichTrucService lichTrucService;

    @DeleteMapping("/admin/quanlytaikhoan/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable(value = "id") int id) {
        this.quanLyTaiKhoanService.xoaTaiKhoan(id);
    }

//    @DeleteMapping("/admin/quanlythuoc/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void xoaThuoc(@PathVariable(value = "id") int id) {
//        this.quanLyThuocService.xoaThuoc(id);
//    }
    @DeleteMapping("/admin/lichtruc/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void xoaLichTruc(@PathVariable(value = "id") int id) {
        this.lichTrucService.xoaLichTruc(id);
    }

    @DeleteMapping("/admin/dichvu/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void xoaDichVu(@PathVariable(value = "id") int id) {
        this.quanLyThuocService.xoaDichVu(id);
    }
}
