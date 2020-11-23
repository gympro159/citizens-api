package com.viettel.citizensapi.config;

import com.viettel.citizensapi.model.Depart;
import com.viettel.citizensapi.model.Phuong;
import com.viettel.citizensapi.model.Quan;
import com.viettel.citizensapi.model.Rate;
import com.viettel.citizensapi.model.SOSMember;
import com.viettel.citizensapi.model.Type;
import com.viettel.citizensapi.model.WarningInfo;
import com.viettel.citizensapi.repository.SOSMemberRepository;
import com.viettel.citizensapi.repository.WarningInfoRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = { SOSMemberRepository.class, WarningInfoRepository.class })
@Configuration
public class DataConfig {

    @Bean
    CommandLineRunner commandLineRunner(SOSMemberRepository sosMemberRepository,
            WarningInfoRepository warningInfoRepository) {
        return string -> {
            // SOSMembers

            // Thanh khê
            sosMemberRepository.save(new SOSMember("1", "Ngô Bảo Ngọc", "0123456789",
                    new Phuong("1", "Phường Vĩnh Trung", new Quan("1", "Quận Thanh Khê"))));
            sosMemberRepository.save(new SOSMember("2", "Trần Thị Như Hoa", "0123456789",
                    new Phuong("1", "Phường Vĩnh Trung", new Quan("1", "Quận Thanh Khê"))));
            sosMemberRepository.save(new SOSMember("3", "Nguyễn Văn Phú", "0123456789",
                    new Phuong("1", "Phường Vĩnh Trung", new Quan("1", "Quận Thanh Khê"))));
            sosMemberRepository.save(new SOSMember("4", "Đặng Hoài Sơn", "0123456789",
                    new Phuong("2", "Phường Tân Chính", new Quan("1", "Quận Thanh Khê"))));

            // Sơn Trà
            sosMemberRepository.save(new SOSMember("5", "Ngô Bảo Ngọc", "0123456789",
                    new Phuong("1", "Phường Vĩnh Trung", new Quan("2", "Quận Sơn Trà"))));
            sosMemberRepository.save(new SOSMember("6", "Trần Thị Như Hoa", "0123456789",
                    new Phuong("1", "Phường Vĩnh Trung", new Quan("2", "Quận Sơn Trà"))));
            sosMemberRepository.save(new SOSMember("7", "Nguyễn Văn Phú", "0123456789",
                    new Phuong("1", "Phường Vĩnh Trung", new Quan("2", "Quận Sơn Trà"))));
            sosMemberRepository.save(new SOSMember("8", "Đặng Hoài Sơn", "0123456789",
                    new Phuong("2", "Phường Tân Chính", new Quan("2", "Quận Sơn Trà"))));

            // Ngũ Hành Sơn
            sosMemberRepository.save(new SOSMember("9", "Ngô Bảo Ngọc", "0123456789",
                    new Phuong("1", "Phường Vĩnh Trung", new Quan("3", "Quận Ngũ Hành Sơn"))));
            sosMemberRepository.save(new SOSMember("10", "Trần Thị Như Hoa", "0123456789",
                    new Phuong("1", "Phường Vĩnh Trung", new Quan("3", "Quận Ngũ Hành Sơn"))));
            sosMemberRepository.save(new SOSMember("11", "Nguyễn Văn Phú", "0123456789",
                    new Phuong("1", "Phường Vĩnh Trung", new Quan("3", "Quận Ngũ Hành Sơn"))));
            sosMemberRepository.save(new SOSMember("12", "Đặng Hoài Sơn", "0123456789",
                    new Phuong("2", "Phường Tân Chính", new Quan("3", "Quận Ngũ Hành Sơn"))));

            // Liên Chiểu
            sosMemberRepository.save(new SOSMember("13", "Ngô Bảo Ngọc", "0123456789",
                    new Phuong("1", "Phường Vĩnh Trung", new Quan("4", "Quận Liên Chiểu"))));
            sosMemberRepository.save(new SOSMember("14", "Trần Thị Như Hoa", "0123456789",
                    new Phuong("1", "Phường Vĩnh Trung", new Quan("4", "Quận Liên Chiểu"))));
            sosMemberRepository.save(new SOSMember("15", "Nguyễn Văn Phú", "0123456789",
                    new Phuong("1", "Phường Vĩnh Trung", new Quan("4", "Quận Liên Chiểu"))));
            sosMemberRepository.save(new SOSMember("16", "Đặng Hoài Sơn", "0123456789",
                    new Phuong("2", "Phường Tân Chính", new Quan("4", "Quận Liên Chiểu"))));

            // Hải Châu
            sosMemberRepository.save(new SOSMember("17", "Ngô Bảo Ngọc", "0123456789",
                    new Phuong("1", "Phường Vĩnh Trung", new Quan("5", "Quận Hải Châu"))));
            sosMemberRepository.save(new SOSMember("18", "Trần Thị Như Hoa", "0123456789",
                    new Phuong("1", "Phường Vĩnh Trung", new Quan("5", "Quận Hải Châu"))));
            sosMemberRepository.save(new SOSMember("19", "Nguyễn Văn Phú", "0123456789",
                    new Phuong("1", "Phường Vĩnh Trung", new Quan("5", "Quận Hải Châu"))));
            sosMemberRepository.save(new SOSMember("20", "Đặng Hoài Sơn", "0123456789",
                    new Phuong("2", "Phường Tân Chính", new Quan("5", "Quận Hải Châu"))));

            // Cẩm Lệ
            sosMemberRepository.save(new SOSMember("21", "Ngô Bảo Ngọc", "0123456789",
                    new Phuong("1", "Phường Vĩnh Trung", new Quan("6", "Quận Cẩm Lệ"))));
            sosMemberRepository.save(new SOSMember("22", "Trần Thị Như Hoa", "0123456789",
                    new Phuong("1", "Phường Vĩnh Trung", new Quan("6", "Quận Cẩm Lệ"))));
            sosMemberRepository.save(new SOSMember("23", "Nguyễn Văn Phú", "0123456789",
                    new Phuong("1", "Phường Vĩnh Trung", new Quan("6", "Quận Cẩm Lệ"))));
            sosMemberRepository.save(new SOSMember("24", "Đặng Hoài Sơn", "0123456789",
                    new Phuong("2", "Phường Tân Chính", new Quan("6", "Quận Cẩm Lệ"))));

            // WarningInfo
            warningInfoRepository.save(new WarningInfo("1", "Thông báo kẹt xe", "23/11/2020 13:02",
                    "Đoạn đường Điện Biên Phủ bị kẹt xe. Đề nghị người dân đi đường khác",
                    "https://docs.google.com/document/d/1Oh1XfWKi4XTLN_PsonBNOunjr1UX_EdrYlR_kkRSo_g/edit?usp=sharing",
                    new Type("1", "Thời tiết, thiên tai"), new Rate("1", "Nghiêm trọng"),
                    new Depart("1", "Ban chỉ huy ATGT")));
            warningInfoRepository.save(new WarningInfo("2", "Thông báo kẹt xe", "22/11/2020 13:02",
                    "Đoạn đường Điện Biên Phủ bị kẹt xe. Đề nghị người dân đi đường khác",
                    "https://docs.google.com/document/d/1Oh1XfWKi4XTLN_PsonBNOunjr1UX_EdrYlR_kkRSo_g/edit?usp=sharing",
                    new Type("1", "Thời tiết, thiên tai"), new Rate("1", "Nghiêm trọng"),
                    new Depart("1", "Ban chỉ huy ATGT")));
            warningInfoRepository.save(new WarningInfo("3", "Thông báo kẹt xe", "21/11/2020 13:02",
                    "Đoạn đường Điện Biên Phủ bị kẹt xe. Đề nghị người dân đi đường khác",
                    "https://docs.google.com/document/d/1Oh1XfWKi4XTLN_PsonBNOunjr1UX_EdrYlR_kkRSo_g/edit?usp=sharing",
                    new Type("1", "Thời tiết, thiên tai"), new Rate("1", "Nghiêm trọng"),
                    new Depart("1", "Ban chỉ huy ATGT")));
            warningInfoRepository.save(new WarningInfo("4", "Thông báo kẹt xe", "20/11/2020 13:02",
                    "Đoạn đường Điện Biên Phủ bị kẹt xe. Đề nghị người dân đi đường khác",
                    "https://docs.google.com/document/d/1Oh1XfWKi4XTLN_PsonBNOunjr1UX_EdrYlR_kkRSo_g/edit?usp=sharing",
                    new Type("1", "Thời tiết, thiên tai"), new Rate("1", "Nghiêm trọng"),
                    new Depart("1", "Ban chỉ huy ATGT")));
            warningInfoRepository.save(new WarningInfo("5", "Thông báo kẹt xe", "19/11/2020 13:02",
                    "Đoạn đường Điện Biên Phủ bị kẹt xe. Đề nghị người dân đi đường khác",
                    "https://docs.google.com/document/d/1Oh1XfWKi4XTLN_PsonBNOunjr1UX_EdrYlR_kkRSo_g/edit?usp=sharing",
                    new Type("1", "Thời tiết, thiên tai"), new Rate("1", "Nghiêm trọng"),
                    new Depart("1", "Ban chỉ huy ATGT")));
            warningInfoRepository.save(new WarningInfo("6", "Thông báo kẹt xe", "18/11/2020 13:02",
                    "Đoạn đường Điện Biên Phủ bị kẹt xe. Đề nghị người dân đi đường khác",
                    "https://docs.google.com/document/d/1Oh1XfWKi4XTLN_PsonBNOunjr1UX_EdrYlR_kkRSo_g/edit?usp=sharing",
                    new Type("1", "Thời tiết, thiên tai"), new Rate("1", "Nghiêm trọng"),
                    new Depart("1", "Ban chỉ huy ATGT")));
            warningInfoRepository.save(new WarningInfo("7", "Thông báo kẹt xe", "17/11/2020 13:02",
                    "Đoạn đường Điện Biên Phủ bị kẹt xe. Đề nghị người dân đi đường khác",
                    "https://docs.google.com/document/d/1Oh1XfWKi4XTLN_PsonBNOunjr1UX_EdrYlR_kkRSo_g/edit?usp=sharing",
                    new Type("1", "Thời tiết, thiên tai"), new Rate("1", "Nghiêm trọng"),
                    new Depart("1", "Ban chỉ huy ATGT")));
            warningInfoRepository.save(new WarningInfo("8", "Thông báo kẹt xe", "16/11/2020 13:02",
                    "Đoạn đường Điện Biên Phủ bị kẹt xe. Đề nghị người dân đi đường khác",
                    "https://docs.google.com/document/d/1Oh1XfWKi4XTLN_PsonBNOunjr1UX_EdrYlR_kkRSo_g/edit?usp=sharing",
                    new Type("1", "Thời tiết, thiên tai"), new Rate("1", "Nghiêm trọng"),
                    new Depart("1", "Ban chỉ huy ATGT")));
            warningInfoRepository.save(new WarningInfo("9", "Thông báo kẹt xe", "15/11/2020 13:02",
                    "Đoạn đường Điện Biên Phủ bị kẹt xe. Đề nghị người dân đi đường khác",
                    "https://docs.google.com/document/d/1Oh1XfWKi4XTLN_PsonBNOunjr1UX_EdrYlR_kkRSo_g/edit?usp=sharing",
                    new Type("1", "Thời tiết, thiên tai"), new Rate("1", "Nghiêm trọng"),
                    new Depart("1", "Ban chỉ huy ATGT")));
            warningInfoRepository.save(new WarningInfo("10", "Thông báo kẹt xe", "14/11/2020 13:02",
                    "Đoạn đường Điện Biên Phủ bị kẹt xe. Đề nghị người dân đi đường khác",
                    "https://docs.google.com/document/d/1Oh1XfWKi4XTLN_PsonBNOunjr1UX_EdrYlR_kkRSo_g/edit?usp=sharing",
                    new Type("1", "Thời tiết, thiên tai"), new Rate("1", "Nghiêm trọng"),
                    new Depart("1", "Ban chỉ huy ATGT")));
            warningInfoRepository.save(new WarningInfo("11", "Thông báo kẹt xe", "13/11/2020 13:02",
                    "Đoạn đường Điện Biên Phủ bị kẹt xe. Đề nghị người dân đi đường khác",
                    "https://docs.google.com/document/d/1Oh1XfWKi4XTLN_PsonBNOunjr1UX_EdrYlR_kkRSo_g/edit?usp=sharing",
                    new Type("1", "Thời tiết, thiên tai"), new Rate("1", "Nghiêm trọng"),
                    new Depart("1", "Ban chỉ huy ATGT")));
            warningInfoRepository.save(new WarningInfo("12", "Thông báo kẹt xe", "12/11/2020 13:02",
                    "Đoạn đường Điện Biên Phủ bị kẹt xe. Đề nghị người dân đi đường khác",
                    "https://docs.google.com/document/d/1Oh1XfWKi4XTLN_PsonBNOunjr1UX_EdrYlR_kkRSo_g/edit?usp=sharing",
                    new Type("1", "Thời tiết, thiên tai"), new Rate("1", "Nghiêm trọng"),
                    new Depart("1", "Ban chỉ huy ATGT")));
        };
    }
}