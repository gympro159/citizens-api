package com.viettel.citizensapi.config;

import java.util.ArrayList;
import java.util.List;

import com.viettel.citizensapi.model.Depart;
import com.viettel.citizensapi.model.Phuong;
import com.viettel.citizensapi.model.Quan;
import com.viettel.citizensapi.model.Rate;
import com.viettel.citizensapi.model.SOSMember;
import com.viettel.citizensapi.model.Type;
import com.viettel.citizensapi.model.WarningInfo;
import com.viettel.citizensapi.repository.QuanRepository;
import com.viettel.citizensapi.repository.TypeRepository;
import com.viettel.citizensapi.repository.WarningInfoRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = { QuanRepository.class, WarningInfoRepository.class,
                TypeRepository.class })
@Configuration
public class DataConfig {

        @Bean
        CommandLineRunner commandLineRunner(QuanRepository quanRepository, WarningInfoRepository warningInfoRepository,
                        TypeRepository typeRepository) {
                return string -> {
                        // quans

                        // Thanh khê
                        ArrayList<SOSMember> tvVinhTrung = new ArrayList<SOSMember>();
                        tvVinhTrung.add(new SOSMember("1", "Ngô Bảo Ngọc", "0123456789"));
                        tvVinhTrung.add(new SOSMember("2", "Trần Thị Như Hoa", "0123456789"));
                        tvVinhTrung.add(new SOSMember("3", "Nguyễn Văn Phú", "0123456789"));
                        ArrayList<SOSMember> tvTanChinh = new ArrayList<SOSMember>();
                        tvTanChinh.add(new SOSMember("4", "Đặng Hoài Sơn", "0123456789"));
                        ArrayList<Phuong> phuongTrongThanhKhe = new ArrayList<Phuong>();
                        phuongTrongThanhKhe.add(new Phuong("1", "Phường Vĩnh Trung", tvVinhTrung));
                        phuongTrongThanhKhe.add(new Phuong("2", "Phường Tân Chính", tvTanChinh));

                        quanRepository.save(new Quan("1", "Quận Thanh Khê", phuongTrongThanhKhe));

                        // Sơn Trà
                        ArrayList<SOSMember> tvVinhTrung2 = new ArrayList<SOSMember>();
                        tvVinhTrung2.add(new SOSMember("5", "Ngô Bảo Ngọc", "0123456789"));
                        tvVinhTrung2.add(new SOSMember("6", "Trần Thị Như Hoa", "0123456789"));
                        tvVinhTrung2.add(new SOSMember("7", "Nguyễn Văn Phú", "0123456789"));
                        ArrayList<SOSMember> tvTanChinh2 = new ArrayList<SOSMember>();
                        tvTanChinh2.add(new SOSMember("8", "Đặng Hoài Sơn", "0123456789"));
                        ArrayList<Phuong> phuongTrongSonTra = new ArrayList<Phuong>();
                        phuongTrongSonTra.add(new Phuong("3", "Phường Vĩnh Trung 2", tvVinhTrung2));
                        phuongTrongSonTra.add(new Phuong("4", "Phường Tân Chính 2", tvTanChinh2));

                        quanRepository.save(new Quan("2", "Quận Sơn Trà", phuongTrongSonTra));

                        // Ngũ Hành Sơn
                        ArrayList<SOSMember> tvVinhTrung3 = new ArrayList<SOSMember>();
                        tvVinhTrung3.add(new SOSMember("9", "Ngô Bảo Ngọc", "0123456789"));
                        tvVinhTrung3.add(new SOSMember("10", "Trần Thị Như Hoa", "0123456789"));
                        tvVinhTrung3.add(new SOSMember("11", "Nguyễn Văn Phú", "0123456789"));
                        ArrayList<SOSMember> tvTanChinh3 = new ArrayList<SOSMember>();
                        tvTanChinh3.add(new SOSMember("12", "Đặng Hoài Sơn", "0123456789"));
                        ArrayList<Phuong> phuongNHS = new ArrayList<Phuong>();
                        phuongNHS.add(new Phuong("5", "Phường Vĩnh Trung 3", tvVinhTrung3));
                        phuongNHS.add(new Phuong("6", "Phường Tân Chính 3", tvTanChinh3));

                        quanRepository.save(new Quan("3", "Quận Ngũ Hành Sơn", phuongNHS));

                        // Liên Chiểu
                        ArrayList<SOSMember> tvVinhTrung4 = new ArrayList<SOSMember>();
                        tvVinhTrung4.add(new SOSMember("13", "Ngô Bảo Ngọc", "0123456789"));
                        tvVinhTrung4.add(new SOSMember("14", "Trần Thị Như Hoa", "0123456789"));
                        tvVinhTrung4.add(new SOSMember("15", "Nguyễn Văn Phú", "0123456789"));
                        ArrayList<SOSMember> tvTanChinh4 = new ArrayList<SOSMember>();
                        tvTanChinh4.add(new SOSMember("16", "Đặng Hoài Sơn", "0123456789"));
                        ArrayList<Phuong> phuongTrongLienChieu = new ArrayList<Phuong>();
                        phuongTrongLienChieu.add(new Phuong("7", "Phường Vĩnh Trung 4", tvVinhTrung4));
                        phuongTrongLienChieu.add(new Phuong("8", "Phường Tân Chính 4", tvTanChinh4));

                        quanRepository.save(new Quan("4", "Quận Liên Chiểu", phuongTrongLienChieu));

                        // Hải Châu
                        ArrayList<SOSMember> tvVinhTrung5 = new ArrayList<SOSMember>();
                        tvVinhTrung5.add(new SOSMember("17", "Ngô Bảo Ngọc", "0123456789"));
                        tvVinhTrung5.add(new SOSMember("18", "Trần Thị Như Hoa", "0123456789"));
                        tvVinhTrung5.add(new SOSMember("19", "Nguyễn Văn Phú", "0123456789"));
                        ArrayList<SOSMember> tvTanChinh5 = new ArrayList<SOSMember>();
                        tvTanChinh5.add(new SOSMember("20", "Đặng Hoài Sơn", "0123456789"));
                        ArrayList<Phuong> phuongTrongHaiChau = new ArrayList<Phuong>();
                        phuongTrongHaiChau.add(new Phuong("9", "Phường Vĩnh Trung 5", tvVinhTrung5));
                        phuongTrongHaiChau.add(new Phuong("10", "Phường Tân Chính 5", tvTanChinh5));

                        quanRepository.save(new Quan("5", "Quận Hải Châu", phuongTrongHaiChau));

                        // Cẩm Lệ
                        ArrayList<SOSMember> tvVinhTrung6 = new ArrayList<SOSMember>();
                        tvVinhTrung6.add(new SOSMember("21", "Ngô Bảo Ngọc", "0123456789"));
                        tvVinhTrung6.add(new SOSMember("22", "Trần Thị Như Hoa", "0123456789"));
                        tvVinhTrung6.add(new SOSMember("23", "Nguyễn Văn Phú", "0123456789"));
                        ArrayList<SOSMember> tvTanChinh6 = new ArrayList<SOSMember>();
                        tvTanChinh6.add(new SOSMember("24", "Đặng Hoài Sơn", "0123456789"));
                        ArrayList<Phuong> phuongTrongCamLe = new ArrayList<Phuong>();
                        phuongTrongCamLe.add(new Phuong("11", "Phường Vĩnh Trung 6", tvVinhTrung6));
                        phuongTrongCamLe.add(new Phuong("12", "Phường Tân Chính 6", tvTanChinh6));

                        quanRepository.save(new Quan("6", "Quận Cẩm Lệ", phuongTrongCamLe));

                        // WarningInfo
                        warningInfoRepository.save(new WarningInfo("1", "Thông báo kẹt xe", "23/11/2020 13:02",
                                        "Một vụ tai nạn giao thông dẫn đến đoạn đường Điện Biên Phủ gần tượng Mẹ Nhu bị kẹt xe. Đề nghị người dân đi đường khác, người dân nên đi đoạn đường khác để tránh ảnh hướng đến việc đi lại.",
                                        "https://docs.google.com/document/d/1Oh1XfWKi4XTLN_PsonBNOunjr1UX_EdrYlR_kkRSo_g/edit?usp=sharing",
                                        new Type("1", "Thời tiết, thiên tai"), new Rate("1", "Quan trọng"),
                                        new Depart("1", "Ban chỉ huy PCTT")));
                        warningInfoRepository.save(new WarningInfo("2", "Một vụ tai nạn giao thông dẫn đến đoạn đường Điện Biên Phủ gần tượng Mẹ Nhu bị kẹt xe.", "22/11/2020 13:02",
                                        "Một vụ tai nạn giao thông dẫn đến đoạn đường Điện Biên Phủ gần tượng Mẹ Nhu bị kẹt xe. Đề nghị người dân đi đường khác, người dân nên đi đoạn đường khác để tránh ảnh hướng đến việc đi lại.",
                                        "https://docs.google.com/document/d/1Oh1XfWKi4XTLN_PsonBNOunjr1UX_EdrYlR_kkRSo_g/edit?usp=sharing",
                                        new Type("2", "Giao thông"), new Rate("1", "Quan trọng"),
                                        new Depart("2", "Ban chỉ huy ATGT")));
                        warningInfoRepository.save(new WarningInfo("3", "Thông báo kẹt xe", "21/11/2020 13:02",
                                        "Đoạn đường Điện Biên Phủ bị kẹt xe. Đề nghị người dân đi đường khác",
                                        "https://docs.google.com/document/d/1Oh1XfWKi4XTLN_PsonBNOunjr1UX_EdrYlR_kkRSo_g/edit?usp=sharing",
                                        new Type("3", "Tội phạm, lừa đảo"), new Rate("2", "Nặng"),
                                        new Depart("3", "Ban chỉ huy PCTP")));
                        warningInfoRepository.save(new WarningInfo("4", "Thông báo kẹt xe", "20/11/2020 13:02",
                                        "Đoạn đường Điện Biên Phủ bị kẹt xe. Đề nghị người dân đi đường khác",
                                        "https://docs.google.com/document/d/1Oh1XfWKi4XTLN_PsonBNOunjr1UX_EdrYlR_kkRSo_g/edit?usp=sharing",
                                        new Type("4", "Thông tin sai lệch"), new Rate("3", "Vừa"),
                                        new Depart("4", "Ban chỉ huy ATTT")));
                        warningInfoRepository.save(new WarningInfo("5", "Thông báo kẹt xe", "19/11/2020 13:02",
                                        "Đoạn đường Điện Biên Phủ bị kẹt xe. Đề nghị người dân đi đường khác",
                                        "https://docs.google.com/document/d/1Oh1XfWKi4XTLN_PsonBNOunjr1UX_EdrYlR_kkRSo_g/edit?usp=sharing",
                                        new Type("6", "Thông tin điện lực"), new Rate("4", "Nhẹ"),
                                        new Depart("6", "Sở điện lực Việt Nam")));
                        warningInfoRepository.save(new WarningInfo("6", "Thông báo kẹt xe", "18/11/2020 13:02",
                                        "Đoạn đường Điện Biên Phủ bị kẹt xe. Đề nghị người dân đi đường khác",
                                        "https://docs.google.com/document/d/1Oh1XfWKi4XTLN_PsonBNOunjr1UX_EdrYlR_kkRSo_g/edit?usp=sharing",
                                        new Type("7", "Dịch bệnh"), new Rate("1", "Quan trọng"),
                                        new Depart("7", "Bộ Y tế")));
                        warningInfoRepository.save(new WarningInfo("7", "Thông báo kẹt xe", "17/11/2020 13:02",
                                        "Đoạn đường Điện Biên Phủ bị kẹt xe. Đề nghị người dân đi đường khác",
                                        "https://docs.google.com/document/d/1Oh1XfWKi4XTLN_PsonBNOunjr1UX_EdrYlR_kkRSo_g/edit?usp=sharing",
                                        new Type("8", "Khác"), new Rate("1", "Quan trọng"),
                                        new Depart("8", "Thông tin Nhà nước")));
                        warningInfoRepository.save(new WarningInfo("8", "Thông báo kẹt xe", "16/11/2020 13:02",
                                        "Đoạn đường Điện Biên Phủ bị kẹt xe. Đề nghị người dân đi đường khác",
                                        "https://docs.google.com/document/d/1Oh1XfWKi4XTLN_PsonBNOunjr1UX_EdrYlR_kkRSo_g/edit?usp=sharing",
                                        new Type("5", "Hành giả, hàng kém chất lượng"), new Rate("1", "Quan trọng"),
                                        new Depart("5", "Cục Quản lý thị trường")));
                        warningInfoRepository.save(new WarningInfo("9", "Thông báo kẹt xe", "15/11/2020 13:02",
                                        "Đoạn đường Điện Biên Phủ bị kẹt xe. Đề nghị người dân đi đường khác",
                                        "https://docs.google.com/document/d/1Oh1XfWKi4XTLN_PsonBNOunjr1UX_EdrYlR_kkRSo_g/edit?usp=sharing",
                                        new Type("1", "Thời tiết, thiên tai"), new Rate("1", "Quan trọng"),
                                        new Depart("1", "Ban chỉ huy PCTT")));
                        warningInfoRepository.save(new WarningInfo("10", "Thông báo kẹt xe", "14/11/2020 13:02",
                                        "Đoạn đường Điện Biên Phủ bị kẹt xe. Đề nghị người dân đi đường khác",
                                        "https://docs.google.com/document/d/1Oh1XfWKi4XTLN_PsonBNOunjr1UX_EdrYlR_kkRSo_g/edit?usp=sharing",
                                        new Type("1", "Thời tiết, thiên tai"), new Rate("1", "Quan trọng"),
                                        new Depart("1", "Ban chỉ huy PCTT")));
                        warningInfoRepository.save(new WarningInfo("11", "Thông báo kẹt xe", "13/11/2020 13:02",
                                        "Đoạn đường Điện Biên Phủ bị kẹt xe. Đề nghị người dân đi đường khác",
                                        "https://docs.google.com/document/d/1Oh1XfWKi4XTLN_PsonBNOunjr1UX_EdrYlR_kkRSo_g/edit?usp=sharing",
                                        new Type("1", "Thời tiết, thiên tai"), new Rate("1", "Quan trọng"),
                                        new Depart("1", "Ban chỉ huy PCTT")));
                        warningInfoRepository.save(new WarningInfo("12", "Thông báo kẹt xe", "12/11/2020 13:02",
                                        "Đoạn đường Điện Biên Phủ bị kẹt xe. Đề nghị người dân đi đường khác",
                                        "https://docs.google.com/document/d/1Oh1XfWKi4XTLN_PsonBNOunjr1UX_EdrYlR_kkRSo_g/edit?usp=sharing",
                                        new Type("1", "Thời tiết, thiên tai"), new Rate("1", "Quan trọng"),
                                        new Depart("1", "Ban chỉ huy PCTT")));

                        // Type
                        typeRepository.save(new Type("1", "Thời tiết, thiên tai"));
                        typeRepository.save(new Type("2", "Giao thông"));
                        typeRepository.save(new Type("3", "Tội phạm, lừa đảo"));
                        typeRepository.save(new Type("4", "Thông tin sai lệch"));
                        typeRepository.save(new Type("5", "Cục Quản lý thị trường"));
                        typeRepository.save(new Type("6", "Thông tin điện lực"));
                        typeRepository.save(new Type("7", "Dịch bệnh"));
                        typeRepository.save(new Type("8", "Khác"));
                };
        }
}