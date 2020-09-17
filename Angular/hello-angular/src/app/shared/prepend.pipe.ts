import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'prepend'
})
export class PrependPipe implements PipeTransform {

  transform(param1: string, param2 : string) {

    //you can do some really fancy logic here
    //You'll neeed imagination
    //Pipes manipulate how the data will be potrayed

    return param2.concat(param1);
  }

}
