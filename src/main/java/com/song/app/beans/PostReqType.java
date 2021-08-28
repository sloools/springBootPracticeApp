package com.song.app.beans;

import java.util.List;
import lombok.*;

@Getter
@Setter
public class PostReqType {
	private String brand;
	private List<PostReqShape> shape;
}
