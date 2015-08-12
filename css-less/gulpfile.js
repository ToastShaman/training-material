/**
 * Created by chfe on 04/08/15.
 */
var gulp = require('gulp');
var less = require('gulp-less');
var path = require('path');


gulp.task('less', function () {
    return gulp.src('*.less')
        .pipe(less())
        .pipe(gulp.dest('.'));
});

gulp.task('watch-less', function(){
    gulp.watch('*.less', ['less']);
});
