package com.my.wiki.controller;

import com.my.wiki.domain.Demo;
import com.my.wiki.domain.Ebook;
import com.my.wiki.req.EbookReq;
import com.my.wiki.resp.CommonResp;
import com.my.wiki.resp.EbookResp;
import com.my.wiki.service.DemoService;
import com.my.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp list(EbookReq req){
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> list=ebookService.list(req);
        resp.setContent(list);
        return resp;
    }
}
