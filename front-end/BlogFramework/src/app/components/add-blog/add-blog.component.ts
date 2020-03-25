import { Component, OnInit } from '@angular/core';
import { BlogService } from 'src/app/services/blog.service';

@Component({
  selector: 'app-add-blog',
  templateUrl: './add-blog.component.html',
  styleUrls: ['./add-blog.component.css']
})
export class AddBlogComponent implements OnInit {

  blog = {
    title: '',
    description: '',
    published: false
  };
  submitted = false;

  constructor(private blogService: BlogService) { }

  ngOnInit() {
  }

  saveblog() {
    const data = {
      title: this.blog.title,
      description: this.blog.description
    };

    this.blogService.create(data)
      .subscribe(
        response => {
          console.log(response);
        },
        error => {
          console.log(error);
        });

    this.submitted = true;
  }

  newblog() {
    this.submitted = false;
    this.blog = {
      title: '',
      description: '',
      published: false
    };
  }

}
