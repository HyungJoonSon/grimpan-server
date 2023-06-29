package com.grimpan.drawingdiary.dto;

import com.grimpan.drawingdiary.domain.Diary;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class DiaryResponse {
    private Long id;
    private String title;
    private String imageData;
    private String content;

    public static DiaryResponse of(Diary diary){
        return DiaryResponse.builder()
                .id(diary.getId())
                .title(diary.getTitle())
                .content(diary.getContent())
                .build();
    }
}
